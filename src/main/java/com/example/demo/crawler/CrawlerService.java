package com.example.demo.crawler;

import java.util.Map;

public interface CrawlerService {
    Map<String, ?> findNamesFromWeb(Map<String, String> paramMap);
}
