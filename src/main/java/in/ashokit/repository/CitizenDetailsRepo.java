package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.CitizenDetails;

public interface CitizenDetailsRepo extends JpaRepository<CitizenDetails, Serializable> {

}
