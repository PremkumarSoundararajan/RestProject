import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequresResponse {
    private int page;
    private int per_page;
    private int total;
    private int total_pages;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RequresResponse)) return false;
        RequresResponse that = (RequresResponse) o;
        return page == that.page && per_page == that.per_page && total == that.total && total_pages == that.total_pages && Objects.equals(data, that.data) && Objects.equals(support, that.support);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, per_page, total, total_pages, data, support);
    }

    public List<DataP> getData() {
        return data;
    }

    public void setData(List<DataP> data) {
        this.data = data;
    }

    private List<DataP> data;
    private Support support;



    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }




}
