package com.app.sstestbknd.function;

import com.app.sstestbknd.model.Manager;
import com.app.sstestbknd.model.Pet;
import com.app.sstestbknd.model.PetCareCenter;
import com.app.sstestbknd.model.PetOwner;
import com.app.sstestbknd.model.Document;
import com.app.sstestbknd.model.PetService;




import com.app.sstestbknd.enums.PetServiceType;
import com.app.sstestbknd.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  