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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.llol.repository.OrganizationRepository;
import com.app.llol.repository.EmployeePersonalInfoRepository;
import com.app.llol.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
