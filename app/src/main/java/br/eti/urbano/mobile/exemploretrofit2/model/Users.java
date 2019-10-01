package br.eti.urbano.mobile.exemploretrofit2.model;

public class Users {

        public Integer id;
        public String name ;
        public String username;
        public String email;
        public Adress adress;
        public String phone;
        public String webite;
        public Company company;

    public Users(){

    }
    public Users(Integer id,String name,String username,String email,Adress adress,String phone,String webite,Company company){
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.adress = adress;
        this.phone = phone;
        this.webite = webite;
        this.company = company;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebite() {
        return webite;
    }

    public void setWebite(String webite) {
        this.webite = webite;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;


    }


}