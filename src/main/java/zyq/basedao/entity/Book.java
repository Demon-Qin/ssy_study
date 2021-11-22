package zyq.basedao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @authoradmin
 * @date 2021/11/20 10:51
 * @description Book
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Long id;
    private String isbn;
    private String name;
    private Double price;
    private LocalDate published;
}
