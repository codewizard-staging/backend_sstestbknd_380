package com.app.sstestbknd.function;

import com.app.sstestbknd.model.Manager;
import com.app.sstestbknd.model.Pet;
import com.app.sstestbknd.model.PetCareCenter;
import com.app.sstestbknd.model.PetOwner;
import com.app.sstestbknd.model.Document;
import com.app.sstestbknd.model.PetService;
import com.app.sstestbknd.enums.PetServiceType;
import com.app.sstestbknd.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.sstestbknd.repository.PetServiceRepository;
import com.app.sstestbknd.repository.PetOwnerRepository;
import com.app.sstestbknd.repository.PetCareCenterRepository;
import com.app.sstestbknd.repository.ManagerRepository;
import com.app.sstestbknd.repository.DocumentRepository;
import com.app.sstestbknd.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
