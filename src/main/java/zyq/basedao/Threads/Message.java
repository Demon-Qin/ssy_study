package zyq.basedao.Threads;

/**
 * @authoradmin
 * @date 2021/11/24 22:50
 * @description Message
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
class Message {
    private int id;
    private Object value;
}
