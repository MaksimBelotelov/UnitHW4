package seminars.fourth.web;

public class HttpClient {
    public String get(String url) {
        //Здесь мы подключаемся и отправляем гет запрос на адрес url и получаем ответ
        String fakeAnswer = "GET Response Code :: 200\n" +
                "<html><head> <title>index</title></head><body><h1>Hello!</h1>";
        return fakeAnswer;
    }
}
