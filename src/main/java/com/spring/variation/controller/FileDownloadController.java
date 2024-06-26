package com.spring.variation.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class FileDownloadController {

    //private final Path fileStorageLocation = Paths.get("/home/user/files").toAbsolutePath().normalize();
    private final Path fileStorageLocation = Paths.get("/opt/apache-tomcat-9/webapps/file/").toAbsolutePath().normalize();

    @GetMapping("/downloadFile")
    public ResponseEntity<Resource> downloadFile(@RequestParam String phone,@RequestParam String code) {
        try {
        	String fileName = phone + "_" + code + ".zip";
            Path filePath = fileStorageLocation.resolve(fileName).normalize();
            Resource resource = new UrlResource(filePath.toUri());

            if (resource.exists()) {
                return ResponseEntity.ok()
                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (MalformedURLException ex) {
            return ResponseEntity.badRequest().build();
        }
    }
}
