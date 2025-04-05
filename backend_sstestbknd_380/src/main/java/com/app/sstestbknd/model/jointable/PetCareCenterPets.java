package com.app.sstestbknd.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.sstestbknd.model.Manager;
import com.app.sstestbknd.model.Pet;
import com.app.sstestbknd.model.PetCareCenter;
import com.app.sstestbknd.model.PetOwner;
import com.app.sstestbknd.model.Document;
import com.app.sstestbknd.model.PetService;
import com.app.sstestbknd.enums.PetServiceType;
import com.app.sstestbknd.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterPets")
@Table(schema = "\"sstestbknd_654\"", name = "\"PetCareCenterPets\"")
@Data
public class PetCareCenterPets{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"PetId\"")
    private Integer petId;
 
}