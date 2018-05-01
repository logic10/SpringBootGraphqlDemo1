package th.co.truecorp.esd.grapghql.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CSM_ACCOUNT")
@EqualsAndHashCode(exclude = {"customer"})
@ToString(exclude = {"customer"})
public class CsmAccount {

    @Column(name = "ACCT_BAL_POLICY")
    private String acctBalPolicy;

    @Column(name = "APPLICATION_ID")
    private String applicationId;

    @Column(name = "BILLING_CURRENCY")
    private String billingCurrency;

    @Column(name = "BUSINESS_ENTITY_ID")
    private BigDecimal businessEntityId;

    @Column(name = "COLL_FIX_CSR_CD")
    private String collFixCsrCd;

    @Column(name = "COLL_FIX_POLICY_CD")
    private String collFixPolicyCd;

    @Column(name = "COLL_IND")
    private String collInd;

    @Column(name = "COLL_PRMT_WAVE_IND")
    private String collPrmtWaveInd;

    @Column(name = "COLL_PUNISHMENT_LEVELS")
    private String collPunishmentLevels;

    // @Temporal(TemporalType.DATE)
    @Column(name = "COLL_START_DATE")
    private Date collStartDate;

    @Column(name = "COLL_STATUS")
    private String collStatus;

    @Column(name = "CONV_RUN_NO")
    private BigDecimal convRunNo;

    @Column(name = "CUSTOMER_ID")
    private int customerId;

    @Column(name = "DL_SERVICE_CODE")
    private String dlServiceCode;

    @Column(name = "DL_UPDATE_STAMP")
    private BigDecimal dlUpdateStamp;

    @Column(name = "DOCUMENT_TYPE")
    private String documentType;

    @Column(name = "EXTERNAL_ID")
    private String externalId;

    @Column(name = "FULL_SUSPENSION_IND")
    private String fullSuspensionInd;

    @Column(name = "L3_SUSPENSION_RSN")
    private String l3SuspensionRsn;

    @Column(name = "L9_ACC_STS_BAN")
    private BigDecimal l9AccStsBan;

    @Column(name = "L9_ACC_SUB_TYPE")
    private String l9AccSubType;

    @Column(name = "L9_ACCOUNT_PRIORITY")
    private String l9AccountPriority;

    @Column(name = "L9_AGREEMENT_ID")
    private BigDecimal l9AgreementId;

    @Column(name = "L9_ATB_CHARITY_CODE")
    private String l9AtbCharityCode;

    @Column(name = "L9_AUTO_BLACKLIST_IND")
    private String l9AutoBlacklistInd;

    @Column(name = "L9_AUTO_BLACKLIST_RSN_CD")
    private String l9AutoBlacklistRsnCd;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_AUTO_BLACKLIST_UP_DATE")
    private Date l9AutoBlacklistUpDate;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_CL_WAIVER_UPD_DATE")
    private Date l9ClWaiverUpdDate;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_COL_LAST_ACT_DATE")
    private Date l9ColLastActDate;

    @Column(name = "L9_COL_RSN_CD")
    private String l9ColRsnCd;

    @Column(name = "L9_COL_STATUS")
    private String l9ColStatus;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_COLL_WAIVER_EXP_DATE")
    private Date l9CollWaiverExpDate;

    @Column(name = "L9_COMPANY_CODE")
    private String l9CompanyCode;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_CONV_EFFECTIVE_DATE")
    private Date l9ConvEffectiveDate;

    @Column(name = "L9_CONVERGENCE_CODE")
    private String l9ConvergenceCode;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_CRD_LAST_ACT_DATE")
    private Date l9CrdLastActDate;

    @Column(name = "L9_CRD_LMT_FIX_POLICY_CD")
    private String l9CrdLmtFixPolicyCd;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_CRD_LMT_WAIVER_EXP_DATE")
    private Date l9CrdLmtWaiverExpDate;

    @Column(name = "L9_CRD_LMT_WAIVER_IND")
    private String l9CrdLmtWaiverInd;

    @Column(name = "L9_CRD_RSN_CD")
    private String l9CrdRsnCd;

    @Column(name = "L9_CRD_STATUS")
    private String l9CrdStatus;

    @Column(name = "L9_CREDIT_CLASS")
    private String l9CreditClass;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_CREDIT_CLASS_UPD_DATE")
    private Date l9CreditClassUpdDate;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_CREDIT_LIMIT_EXP_DATE")
    private Date l9CreditLimitExpDate;

    @Column(name = "L9_CREDIT_LIMIT_RSN_CODE")
    private String l9CreditLimitRsnCode;

    @Column(name = "L9_CUST_BRANCH_NO")
    private String l9CustBranchNo;

    @Column(name = "L9_CUST_TAX_ID")
    private String l9CustTaxId;

    @Column(name = "L9_IDD_INDICATOR")
    private String l9IddIndicator;

    @Column(name = "L9_INITIATION_REASON")
    private String l9InitiationReason;

    @Column(name = "L9_IR_INDICATOR")
    private String l9IrIndicator;

    @Column(name = "L9_LEGACY_BAN")
    private BigDecimal l9LegacyBan;

    @Column(name = "L9_MANUAL_BLACKLIST_IND")
    private String l9ManualBlacklistInd;

    @Column(name = "L9_MANUAL_BLACKLIST_RSN_CD")
    private String l9ManualBlacklistRsnCd;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_MANUAL_BLACKLIST_UP_DATE")
    private Date l9ManualBlacklistUpDate;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_OBLG_CALC_FORM_UPD_DATE")
    private Date l9OblgCalcFormUpdDate;

    @Column(name = "L9_OBLIGATION_CALC_FORMULA")
    private String l9ObligationCalcFormula;

    @Column(name = "L9_OPERATOR_ID")
    private BigDecimal l9OperatorId;

    @Column(name = "L9_OPERATOR_NAME")
    private String l9OperatorName;

    @Column(name = "L9_PARENT_BAN")
    private BigDecimal l9ParentBan;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_PERSONAL_CL_UPD_DATE")
    private Date l9PersonalClUpdDate;

    @Column(name = "L9_PRSNL_CREDIT_LIMIT")
    private BigDecimal l9PrsnlCreditLimit;


    @Column(name = "L9_RELATED_OU")
    private BigDecimal l9RelatedOu;

    @Column(name = "L9_SPECIAL_INSTRUCTIONS")
    private String l9SpecialInstructions;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_TEMP_CL_UPD_DATE")
    private Date l9TempClUpdDate;

    @Column(name = "L9_TEMP_CREDIT_LIMIT")
    private BigDecimal l9TempCreditLimit;

    @Column(name = "L9_WHT_CERTI_NO")
    private String l9WhtCertiNo;

    @Column(name = "L9_WHT_IND")
    private String l9WhtInd;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_WHT_TAX_UP_DATE")
    private Date l9WhtTaxUpDate;

    // @Temporal(TemporalType.DATE)
    @Column(name = "OPEN_DATE")
    private Date openDate;

    @Column(name = "OPERATOR_ID")
    private BigDecimal operatorId;

    @Column(name = "SUSPENTION_TYPE")
    private String suspentionType;

    // @Temporal(TemporalType.DATE)
    @Column(name = "SYS_CREATION_DATE")
    private Date sysCreationDate;

    // @Temporal(TemporalType.DATE)
    @Column(name = "SYS_UPDATE_DATE")
    private Date sysUpdateDate;

    // bi-directional one-to-one association to CsmPayChannel
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BAN", insertable = false, updatable = false)
    private CsmPayChannel csmPayChannel;

    @Id
    @Column(name = "BAN")
    private String ban;

    @JsonIgnore
    @ManyToOne(optional = false, targetEntity = Customer.class)
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID", updatable = false, insertable = false)
    private Customer customer;

}
