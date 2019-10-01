package br.eti.urbano.mobile.exemploretrofit2.model;

class Geo {
    public Integer lat;
    public Integer lng;

    public Geo(){

    }
    public Geo(Integer lat, Integer lng){
        this.lat = lat;
        this.lng = lng;

    }

    public Integer getLat() {
        return lat;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

    public Integer getLng() {
        return lng;
    }

    public void setLng(Integer lng) {
        this.lng = lng;
    }
}
