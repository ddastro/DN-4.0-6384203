package com.example.mockito;

public class MyService {
    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void fetchData() {
        externalApi.getData();  // Side effect or important call
    }
}

