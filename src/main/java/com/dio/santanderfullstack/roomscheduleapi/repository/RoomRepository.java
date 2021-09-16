package com.dio.santanderfullstack.roomscheduleapi.repository;

import com.dio.santanderfullstack.roomscheduleapi.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
