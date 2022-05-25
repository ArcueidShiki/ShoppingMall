package cn.tedu.shoppingmallv1.entity;

public class Banner {
    private Integer id;
    private String banner; // 轮播图文件名称

    @Override
    public String toString() {
        return "Banner{" +
                "id=" + id +
                ", banner='" + banner + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }
}
