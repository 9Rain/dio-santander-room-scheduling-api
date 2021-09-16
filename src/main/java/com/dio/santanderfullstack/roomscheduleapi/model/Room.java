package com.dio.santanderfullstack.roomscheduleapi.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "date", nullable = false)
    private String date;

    @Column(name = "start_hour", nullable = false)
    private String startHour;

    @Column(name = "end_hour", nullable = false)
    private String endHour;

    @Override
    public String toString() {
        return "Room [id=" + id + ", name=" + name + ", startHour=" + startHour + ", endHour=" + endHour
                + "]";
    }
}
