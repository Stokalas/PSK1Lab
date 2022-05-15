package lt.vu.mif.lab1psk.usecases;

import lt.vu.mif.lab1psk.interceptors.Logger;
import lt.vu.mif.lab1psk.services.AltIsbnGenerator;
import lt.vu.mif.lab1psk.services.IsbnGenerator;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@SessionScoped
@Named
public class GenerateIsbnCode implements Serializable {
    @Inject
    IsbnGenerator isbnGenerator;

    private CompletableFuture<String> isbnGenerationTask = null;

    @Logger
    public String generateIsbn() {
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();

        isbnGenerationTask = CompletableFuture.supplyAsync(() -> isbnGenerator.generateIsbn());

        return "/bookDetails.xhtml?faces-redirect=true&bookId=" + requestParameters.get("bookId");
    }

    public boolean isIsbnGenerationRunning() {
        return isbnGenerationTask != null && !isbnGenerationTask.isDone();
    }

    public String getIsbnGenerationStatus() throws ExecutionException, InterruptedException {
        if (isbnGenerationTask == null) {
            return null;
        }
        else if (isIsbnGenerationRunning()) {
            return "Isbn generation in progress";
        }
        return "Suggested Isbn: " + isbnGenerationTask.get();
    }
}
