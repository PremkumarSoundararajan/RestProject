import java.util.Objects;

public class Support {
    private String url;
    private String text;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Support)) return false;
        Support support = (Support) o;
        return Objects.equals(url, support.url) && Objects.equals(text, support.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, text);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
