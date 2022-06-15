package algoritma;

public class Product {
    public String name;
    public Integer harga;
    public Double rating;
    public Integer likes;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", harga=" + harga +
                ", rating=" + rating +
                ", likes=" + likes +
                '}';
    }

    Product(String name, Integer harga, Double rating, Integer likes) {
        this.name = name;
        this.harga = harga;
        this.rating = rating;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
