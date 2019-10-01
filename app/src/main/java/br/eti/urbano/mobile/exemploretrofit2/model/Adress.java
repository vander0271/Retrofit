package br.eti.urbano.mobile.exemploretrofit2.model;

class Adress {
    public String street;
    public String suite;
    public String city;
    public Integer zipcode;
    public Geo geo;
    public Adress(){

    }
    public Adress(String street, String suite, String city, Integer zipcode, Geo geo){
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }
}

