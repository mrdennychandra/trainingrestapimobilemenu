
package id.ac.unimed.mobileunimed.media;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sizes {

    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;
    @SerializedName("medium")
    @Expose
    private Medium medium;
    @SerializedName("shop_thumbnail")
    @Expose
    private ShopThumbnail shopThumbnail;
    @SerializedName("shop_catalog")
    @Expose
    private ShopCatalog shopCatalog;
    @SerializedName("shop_single")
    @Expose
    private ShopSingle shopSingle;
    @SerializedName("post-thumbnail")
    @Expose
    private PostThumbnail postThumbnail;
    @SerializedName("skillful-masonry-gallery")
    @Expose
    private SkillfulMasonryGallery skillfulMasonryGallery;
    @SerializedName("skillful-masonry")
    @Expose
    private SkillfulMasonry skillfulMasonry;
    @SerializedName("skillful-portfolio-small")
    @Expose
    private SkillfulPortfolioSmall skillfulPortfolioSmall;
    @SerializedName("skillful-blog-2")
    @Expose
    private SkillfulBlog2 skillfulBlog2;
    @SerializedName("skillful-blog-3")
    @Expose
    private SkillfulBlog3 skillfulBlog3;
    @SerializedName("skillful-portfolio-3")
    @Expose
    private SkillfulPortfolio3 skillfulPortfolio3;
    @SerializedName("full")
    @Expose
    private Full full;

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public ShopThumbnail getShopThumbnail() {
        return shopThumbnail;
    }

    public void setShopThumbnail(ShopThumbnail shopThumbnail) {
        this.shopThumbnail = shopThumbnail;
    }

    public ShopCatalog getShopCatalog() {
        return shopCatalog;
    }

    public void setShopCatalog(ShopCatalog shopCatalog) {
        this.shopCatalog = shopCatalog;
    }

    public ShopSingle getShopSingle() {
        return shopSingle;
    }

    public void setShopSingle(ShopSingle shopSingle) {
        this.shopSingle = shopSingle;
    }

    public PostThumbnail getPostThumbnail() {
        return postThumbnail;
    }

    public void setPostThumbnail(PostThumbnail postThumbnail) {
        this.postThumbnail = postThumbnail;
    }

    public SkillfulMasonryGallery getSkillfulMasonryGallery() {
        return skillfulMasonryGallery;
    }

    public void setSkillfulMasonryGallery(SkillfulMasonryGallery skillfulMasonryGallery) {
        this.skillfulMasonryGallery = skillfulMasonryGallery;
    }

    public SkillfulMasonry getSkillfulMasonry() {
        return skillfulMasonry;
    }

    public void setSkillfulMasonry(SkillfulMasonry skillfulMasonry) {
        this.skillfulMasonry = skillfulMasonry;
    }

    public SkillfulPortfolioSmall getSkillfulPortfolioSmall() {
        return skillfulPortfolioSmall;
    }

    public void setSkillfulPortfolioSmall(SkillfulPortfolioSmall skillfulPortfolioSmall) {
        this.skillfulPortfolioSmall = skillfulPortfolioSmall;
    }

    public SkillfulBlog2 getSkillfulBlog2() {
        return skillfulBlog2;
    }

    public void setSkillfulBlog2(SkillfulBlog2 skillfulBlog2) {
        this.skillfulBlog2 = skillfulBlog2;
    }

    public SkillfulBlog3 getSkillfulBlog3() {
        return skillfulBlog3;
    }

    public void setSkillfulBlog3(SkillfulBlog3 skillfulBlog3) {
        this.skillfulBlog3 = skillfulBlog3;
    }

    public SkillfulPortfolio3 getSkillfulPortfolio3() {
        return skillfulPortfolio3;
    }

    public void setSkillfulPortfolio3(SkillfulPortfolio3 skillfulPortfolio3) {
        this.skillfulPortfolio3 = skillfulPortfolio3;
    }

    public Full getFull() {
        return full;
    }

    public void setFull(Full full) {
        this.full = full;
    }

}
