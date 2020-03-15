package pl.brokeridge.system_supporting_brokeridge.search;

public class Searcher {

    private String urlWithParams;
    private String urlWithParams2;

    public Searcher(String country, String destinationCity, String dateFrom, String dateTo, String url, String url2) {

        urlWithParams = url + "?country=" + country + "&destinationCity=" + destinationCity + "&dateFrom=" + dateFrom + "&dateTo=" + dateTo;
        urlWithParams2 = url2 + "?country=" + country + "&destinationCity=" + destinationCity + "&dateFrom=" + dateFrom + "&dateTo=" + dateTo;

        System.out.println(urlWithParams);

        System.out.println(urlWithParams2);
    }

    public String getUrlWithParams() {
        return urlWithParams;
    }

    public void setUrlWithParams(String urlWithParams) {
        this.urlWithParams = urlWithParams;
    }

    public String getUrlWithParams2() {
        return urlWithParams2;
    }

    public void setUrlWithParams2(String urlWithParams2) {
        this.urlWithParams2 = urlWithParams2;
    }
}
