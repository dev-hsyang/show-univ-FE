package com.konai.hsyang.konatoyfe.fileWebClient.domain;

import com.konai.hsyang.konatoyfe.postWebClient.domain.Posts;
import lombok.Getter;

@Getter
public class File {

    private Long fileID;
    private Posts posts;
    private String orgfilename;
    private String savefilename;
    private String storepath;
    private Long filesize;
}
