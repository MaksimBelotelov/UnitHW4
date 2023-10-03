package seminars.fourth.web;

public class WebService {
    private HttpClient client;

    public WebService(HttpClient client) {
        this.client = client;
    }

    public String sendGet(String url) {
        return client.get(url) + "\nGET DONE";
    }
}
