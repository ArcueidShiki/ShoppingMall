package cn.tedu.shoppingmallv1.entity;

public class Banner {
    private Integer id;
    private String bannerUrl;

    @Override
    public String toString() {
        return "Banner{" +
                "id=" + id +
                ", bannerUrl='" + bannerUrl + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }
}
