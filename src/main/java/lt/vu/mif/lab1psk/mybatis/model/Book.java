package lt.vu.mif.lab1psk.mybatis.model;

public class Book {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.BOOK.ID
     *
     * @mbg.generated Sun May 15 15:20:03 EEST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.BOOK.ISBN
     *
     * @mbg.generated Sun May 15 15:20:03 EEST 2022
     */
    private String isbn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.BOOK.TITLE
     *
     * @mbg.generated Sun May 15 15:20:03 EEST 2022
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.BOOK.PUBLISHER_ID
     *
     * @mbg.generated Sun May 15 15:20:03 EEST 2022
     */
    private Integer publisherId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.BOOK.ID
     *
     * @return the value of PUBLIC.BOOK.ID
     *
     * @mbg.generated Sun May 15 15:20:03 EEST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.BOOK.ID
     *
     * @param id the value for PUBLIC.BOOK.ID
     *
     * @mbg.generated Sun May 15 15:20:03 EEST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.BOOK.ISBN
     *
     * @return the value of PUBLIC.BOOK.ISBN
     *
     * @mbg.generated Sun May 15 15:20:03 EEST 2022
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.BOOK.ISBN
     *
     * @param isbn the value for PUBLIC.BOOK.ISBN
     *
     * @mbg.generated Sun May 15 15:20:03 EEST 2022
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.BOOK.TITLE
     *
     * @return the value of PUBLIC.BOOK.TITLE
     *
     * @mbg.generated Sun May 15 15:20:03 EEST 2022
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.BOOK.TITLE
     *
     * @param title the value for PUBLIC.BOOK.TITLE
     *
     * @mbg.generated Sun May 15 15:20:03 EEST 2022
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.BOOK.PUBLISHER_ID
     *
     * @return the value of PUBLIC.BOOK.PUBLISHER_ID
     *
     * @mbg.generated Sun May 15 15:20:03 EEST 2022
     */
    public Integer getPublisherId() {
        return publisherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.BOOK.PUBLISHER_ID
     *
     * @param publisherId the value for PUBLIC.BOOK.PUBLISHER_ID
     *
     * @mbg.generated Sun May 15 15:20:03 EEST 2022
     */
    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }
}