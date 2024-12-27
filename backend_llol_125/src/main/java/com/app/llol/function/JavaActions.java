package com.app.llol.function;

import com.app.llol.model.Organization;
import com.app.llol.model.EmployeePersonalInfo;
import com.app.llol.model.EmlpoyeeProfile;




import com.app.llol.enums.EmploymentType;
import com.app.llol.enums.OrgDept;
import com.app.llol.enums.OrgBranch;
import com.app.llol.converter.OrgBranchConverter;
import com.app.llol.converter.EmploymentTypeConverter;
import com.app.llol.converter.OrgDeptConverter;
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
  