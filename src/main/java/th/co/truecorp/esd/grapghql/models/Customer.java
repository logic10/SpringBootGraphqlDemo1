package th.co.truecorp.esd.grapghql.models;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.*;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CUSTOMER")
@EqualsAndHashCode(exclude = {"subscribers", "csmAccounts"})
@ToString(exclude = {"subscribers", "csmAccounts"})
public class Customer {

    @Column(name = "ANNIVERSARY_END_DAY")
    private BigDecimal anniversaryEndDay;

    @Column(name = "APPLICATION_ID")
    private String applicationId;

    @Column(name = "ASSISTANT_USER_ID")
    private BigDecimal assistantUserId;

    @Column(name = "BILL_CYC_PROD_FREQ")
    private BigDecimal billCycProdFreq;

    @Column(name = "BILL_CYCLE")
    private BigDecimal billCycle;

    @Column(name = "BUSINESS_ENTITY_ID")
    private BigDecimal businessEntityId;

    @Column(name = "CH_NODE_ID")
    private BigDecimal chNodeId;

    // @Temporal(TemporalType.DATE)
    @Column(name = "CHG_CYC_REQ_DATE")
    private String chgCycReqDate;

    @Column(name = "CHG_CYCLE_IND")
    private String chgCycleInd;

    @Column(name = "CHG_CYCLE_REQ_STS")
    private String chgCycleReqSts;

    @Column(name = "CONV_RUN_NO")
    private BigDecimal convRunNo;

    @Column(name = "CREDIT_CLASS")
    private String creditClass;

    @Column(name = "CUST_SUB_TYPE")
    private String custSubType;

    @Id
    @Column(name = "CUSTOMER_ID")
    private int customerId;

    @Column(name = "CUSTOMER_TYPE")
    private String customerType;

    @Column(name = "DEALER_CODE")
    private String dealerCode;

    @Column(name = "DFLT_POST_PCN")
    private BigDecimal dfltPostPcn;

    @Column(name = "DFLT_PRE_PCN")
    private BigDecimal dfltPrePcn;

    @Column(name = "DL_SERVICE_CODE")
    private String dlServiceCode;

    @Column(name = "DL_UPDATE_STAMP")
    private BigDecimal dlUpdateStamp;

    // @Temporal(TemporalType.DATE)
    @Column(name = "EFFECTIVE_DATE")
    private String effectiveDate;

    @Column(name = "ENTITY_LOCK_TYPE")
    private String entityLockType;

    // @Temporal(TemporalType.DATE)
    @Column(name = "EXPIRATION_DATE")
    private String expirationDate;

    @Column(name = "EXTERNAL_ID")
    private String externalId;

    @Column(name = "FINANCIAL_LOCK_TYPE")
    private String financialLockType;

    @Column(name = "L3_ALARM_NOFIF_TYPE")
    private String l3AlarmNofifType;

    @Column(name = "L3_ALARM_NOTIF_THRESHOLD")
    private BigDecimal l3AlarmNotifThreshold;

    @Column(name = "L3_CRD_LMT_THRESHOLD")
    private BigDecimal l3CrdLmtThreshold;

    @Column(name = "L3_CREDIT_LIMIT_IND")
    private String l3CreditLimitInd;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_BIRTH_DATE")
    private String l9BirthDate;

    @Column(name = "L9_BLACKLIST_IND")
    private String l9BlacklistInd;

    @Column(name = "L9_BUSINESS_TYPE")
    private String l9BusinessType;

    @Column(name = "L9_CONTACT_LANG")
    private String l9ContactLang;

    @Column(name = "L9_EDUCATION")
    private String l9Education;

    @Column(name = "L9_EMPLOYEE_CODE")
    private String l9EmployeeCode;

    @Column(name = "L9_EMPLOYMENT_STATUS")
    private String l9EmploymentStatus;

    @Column(name = "L9_GRADING")
    private String l9Grading;

    @Column(name = "L9_IDENTIFICATION")
    private String l9Identification;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_IDENTIFICATION_EXP_DATE")
    private String l9IdentificationExpDate;

    @Column(name = "L9_IDENTIFICATION_TYPE")
    private String l9IdentificationType;

    @Column(name = "L9_INDUSTRY_TYPE")
    private String l9IndustryType;

    @Column(name = "L9_INIT_TIME_IN_ADD")
    private String l9InitTimeInAdd;

    @Column(name = "L9_JOB_TYPE")
    private String l9JobType;

    @Column(name = "L9_NATIONALITY")
    private String l9Nationality;

    @Column(name = "L9_NO_OF_EMPLOYEES")
    private String l9NoOfEmployees;

    @Column(name = "L9_OCCUPATION")
    private String l9Occupation;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_PERIOD_OF_WORK")
    private String l9PeriodOfWork;

    @Column(name = "L9_SALARY")
    private String l9Salary;

    @Column(name = "L9_SYSTEM_ID")
    private String l9SystemId;

    @Column(name = "L9_TIME_IN_BUSINESS")
    private String l9TimeInBusiness;

    @Column(name = "L9_TOTAL_SUBSCRIBER")
    private BigDecimal l9TotalSubscriber;

    @Column(name = "L9_TRUE_ID")
    private String l9TrueId;

    @Column(name = "L9_USER_ID")
    private BigDecimal l9UserId;

    @Column(name = "LARGE_CUST_IND")
    private String largeCustInd;

    @Column(name = "LAST_ACTIVITY_CODE")
    private String lastActivityCode;

    @Column(name = "LAST_ACTIVITY_REASON_CODE")
    private String lastActivityReasonCode;

    @Column(name = "LEGACY_CUST_NO")
    private BigDecimal legacyCustNo;

    @Column(name = "MARKETING_CHANNEL")
    private String marketingChannel;

    @Column(name = "NEW_CYC_PROD_FREQ")
    private BigDecimal newCycProdFreq;

    @Column(name = "NEW_CYCLE")
    private BigDecimal newCycle;

    @Column(name = "NEW_ONLINE_PARTITION_ID")
    private BigDecimal newOnlinePartitionId;

    @Column(name = "NEW_PARTITION_ID")
    private BigDecimal newPartitionId;

    @Column(name = "OFFER_CURRENCY")
    private String offerCurrency;

    @Column(name = "ONLINE_PARTITION_ID")
    private BigDecimal onlinePartitionId;

    // @Temporal(TemporalType.DATE)
    @Column(name = "OPEN_DATE")
    private String openDate;

    @Column(name = "OPERATOR_ID")
    private int operatorId;

    @Column(name = "PARTITION_ID")
    private BigDecimal partitionId;

    @Column(name = "RESOURCE_POOL")
    private String resourcePool;

    @Column(name = "SPC_MEMO_IND")
    private String spcMemoInd;

    // @Temporal(TemporalType.DATE)
    @Column(name = "SYS_CREATION_DATE")
    private String sysCreationDate;

    // @Temporal(TemporalType.DATE)
    @Column(name = "SYS_UPDATE_DATE")
    private String sysUpdateDate;

    @OneToMany(targetEntity = Subscriber.class, mappedBy = "customer", cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SELECT)
    private List<Subscriber> subscribers;

    @OneToMany(targetEntity = CsmAccount.class, mappedBy = "customer", cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SELECT)
    private List<CsmAccount> csmAccounts;

}
