package lt.vu.mif.lab1psk.mybatis.model;

public class BookAuthor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.BOOK_AUTHOR.BOOKS_ID
     *
     * @mbg.generated Fri Apr 29 20:36:21 EEST 2022
     */
    private Integer booksId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.BOOK_AUTHOR.AUTHORS_ID
     *
     * @mbg.generated Fri Apr 29 20:36:21 EEST 2022
     */
    private Integer authorsId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.BOOK_AUTHOR.BOOKS_ID
     *
     * @return the value of PUBLIC.BOOK_AUTHOR.BOOKS_ID
     *
     * @mbg.generated Fri Apr 29 20:36:21 EEST 2022
     */
    public Integer getBooksId() {
        return booksId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.BOOK_AUTHOR.BOOKS_ID
     *
     * @param booksId the value for PUBLIC.BOOK_AUTHOR.BOOKS_ID
     *
     * @mbg.generated Fri Apr 29 20:36:21 EEST 2022
     */
    public void setBooksId(Integer booksId) {
        this.booksId = booksId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.BOOK_AUTHOR.AUTHORS_ID
     *
     * @return the value of PUBLIC.BOOK_AUTHOR.AUTHORS_ID
     *
     * @mbg.generated Fri Apr 29 20:36:21 EEST 2022
     */
    public Integer getAuthorsId() {
        return authorsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.BOOK_AUTHOR.AUTHORS_ID
     *
     * @param authorsId the value for PUBLIC.BOOK_AUTHOR.AUTHORS_ID
     *
     * @mbg.generated Fri Apr 29 20:36:21 EEST 2022
     */
    public void setAuthorsId(Integer authorsId) {
        this.authorsId = authorsId;
    }
}