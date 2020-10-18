package PersonInfo;

class Address {
    private String index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public Address() {

    }

    private Address(String index, String country, String city, String street, int house, int apartment) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    static class Builder {
        private Address address;

        public Builder() {
            this.address = new Address();
        }

        Address build() {
            return address;
        }

        Builder addIndex(String index) {
            this.address.setIndex(index);

            return this;
        }

        Builder addCountry(String country) {
            this.address.setCountry(country);

            return this;
        }

        Builder addCity(String city) {
            this.address.setCity(city);

            return this;
        }

        Builder addStreet(String street) {
            this.address.setStreet(street);

            return this;
        }

        Builder addHouse(int house) {
            this.address.setHouse(house);

            return this;
        }

        Builder addApartment(int apartment) {
            this.address.setApartment(apartment);

            return this;
        }
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "index: " + index + "\n" +
                "country: " + country + "\n" +
                "city: " + city + "\n" +
                "street: " + street + "\n" +
                "house: " + house + "\n" +
                "apartment: " + apartment;
    }
}