package cn.tedu.shoppingmallv1.entity;

public class Brand {
    private Integer id;
    private String brand;

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
