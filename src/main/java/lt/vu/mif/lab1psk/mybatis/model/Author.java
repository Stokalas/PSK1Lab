package lt.vu.mif.lab1psk.mybatis.model;

public class Author {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.AUTHOR.ID
     *
     * @mbg.generated Fri Apr 29 20:36:21 EEST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.AUTHOR.NAME
     *
     * @mbg.generated Fri Apr 29 20:36:21 EEST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.AUTHOR.SURNAME
     *
     * @mbg.generated Fri Apr 29 20:36:21 EEST 2022
     */
    private String surname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.AUTHOR.ID
     *
     * @return the value of PUBLIC.AUTHOR.ID
     *
     * @mbg.generated Fri Apr 29 20:36:21 EEST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.AUTHOR.ID
     *
     * @param id the value for PUBLIC.AUTHOR.ID
     *
     * @mbg.generated Fri Apr 29 20:36:21 EEST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.AUTHOR.NAME
     *
     * @return the value of PUBLIC.AUTHOR.NAME
     *
     * @mbg.generated Fri Apr 29 20:36:21 EEST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.AUTHOR.NAME
     *
     * @param name the value for PUBLIC.AUTHOR.NAME
     *
     * @mbg.generated Fri Apr 29 20:36:21 EEST 2022
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.AUTHOR.SURNAME
     *
     * @return the value of PUBLIC.AUTHOR.SURNAME
     *
     * @mbg.generated Fri Apr 29 20:36:21 EEST 2022
     */
    public String getSurname() {
        return surname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.AUTHOR.SURNAME
     *
     * @param surname the value for PUBLIC.AUTHOR.SURNAME
     *
     * @mbg.generated Fri Apr 29 20:36:21 EEST 2022
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
}