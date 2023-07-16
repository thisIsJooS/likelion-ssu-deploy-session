package ssu.likelion.deploysession;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PresidentInfoDto {
    private String name;
    private Integer age;
    private String major;
}
