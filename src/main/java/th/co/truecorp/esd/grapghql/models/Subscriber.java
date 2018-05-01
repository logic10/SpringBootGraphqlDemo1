package th.co.truecorp.esd.grapghql.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SUBSCRIBER")
@EqualsAndHashCode(exclude = {"customer"})
@ToString(exclude = {"customer"})
public class Subscriber {

    @Column(name = "APPLICATION_ID")
    private String applicationId;

    @Column(name = "BUSINESS_ENTITY_ID")
    private BigDecimal businessEntityId;

    @Column(name = "CALC_PYM_CATEGORY")
    private String calcPymCategory;

    @Column(name = "CH_NODE_ID")
    private BigDecimal chNodeId;

    @Column(name = "CONV_RUN_NO")
    private BigDecimal convRunNo;

    @Column(name = "DEALER_CODE")
    private String dealerCode;

    @Column(name = "DL_SERVICE_CODE")
    private String dlServiceCode;

    @Column(name = "DL_UPDATE_STAMP")
    private BigDecimal dlUpdateStamp;

    // @Temporal(TemporalType.DATE)
    @Column(name = "EFFECTIVE_DATE")
    private Date effectiveDate;

    // @Temporal(TemporalType.DATE)
    @Column(name = "EXPIRATION_DATE")
    private Date expirationDate;

    @Column(name = "EXTERNAL_ID")
    private String externalId;

    // @Temporal(TemporalType.DATE)
    @Column(name = "INIT_ACT_DATE")
    private Date initActDate;

    @Column(name = "INITIAL_DLR_CODE")
    private String initialDlrCode;

    @Column(name = "INS_TRX_ID")
    private BigDecimal insTrxId;

    @Column(name = "L3_FIRST_RECHARGE_INDICATOR")
    private String l3FirstRechargeIndicator;

    @Column(name = "L9_ADDR_BAD_DEBT_FLAG")
    private String l9AddrBadDebtFlag;

    @Column(name = "L9_ADDR_FRD_FLAG")
    private String l9AddrFrdFlag;

    @Column(name = "L9_BAR_BY_RATER")
    private String l9BarByRater;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_BARRING_ACT_DATE")
    private Date l9BarringActDate;

    @Column(name = "L9_BARRING_ACT_RSN")
    private String l9BarringActRsn;

    @Column(name = "L9_BARRING_BY_REQ")
    private String l9BarringByReq;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_COL_LAST_ACT_DATE")
    private Date l9ColLastActDate;

    @Column(name = "L9_COL_RSN_CD")
    private String l9ColRsnCd;

    @Column(name = "L9_COL_STATUS")
    private String l9ColStatus;

    @Column(name = "L9_CONVERGENCE_CODE")
    private String l9ConvergenceCode;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_CRD_LAST_ACT_DATE")
    private Date l9CrdLastActDate;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_CRD_LM_SUB_ACT_DATE")
    private Date l9CrdLmSubActDate;

    @Column(name = "L9_CRD_LM_SUB_RSN_CD")
    private String l9CrdLmSubRsnCd;

    @Column(name = "L9_CRD_RSN_CD")
    private String l9CrdRsnCd;

    @Column(name = "L9_CRD_STATUS")
    private String l9CrdStatus;

    @Column(name = "L9_DEALER_APP")
    private String l9DealerApp;

    @Column(name = "L9_DONOR_OPERATOR")
    private String l9DonorOperator;

    @Column(name = "L9_DONOR_ZONE")
    private String l9DonorZone;

    @Column(name = "L9_IMSI_ALIAS")
    private String l9ImsiAlias;

    @Column(name = "L9_INSTALLATION_TYPE")
    private String l9InstallationType;

    @Column(name = "L9_LAST_ACTIVITY_ID")
    private BigDecimal l9LastActivityId;

    @Column(name = "L9_MARKETING_CODE")
    private String l9MarketingCode;

    @Column(name = "L9_MULTI_SIM_IND")
    private String l9MultiSimInd;

    @Column(name = "L9_PHASE_CODE")
    private String l9PhaseCode;

    @Column(name = "L9_PORT_IND")
    private String l9PortInd;

    @Column(name = "L9_PROJECT_CODE")
    private String l9ProjectCode;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_PROOF_DATE")
    private Date l9ProofDate;

    @Column(name = "L9_PROOF_DOC")
    private String l9ProofDoc;

    @Column(name = "L9_REC_OPERATOR")
    private String l9RecOperator;

    @Column(name = "L9_REC_ZONE")
    private String l9RecZone;

    @Column(name = "L9_RELATED_SUBSCRIBER")
    private BigDecimal l9RelatedSubscriber;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_RF_ACT_DATE")
    private Date l9RfActDate;

    @Column(name = "L9_RF_BAN")
    private BigDecimal l9RfBan;

    @Column(name = "L9_RF_SERVICE_LEVEL")
    private String l9RfServiceLevel;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_RMV_ACT_DATE")
    private Date l9RmvActDate;

    @Column(name = "L9_RMV_BAN")
    private BigDecimal l9RmvBan;

    @Column(name = "L9_RMV_SERVICE_LEVEL")
    private String l9RmvServiceLevel;

    @Column(name = "L9_SALE_CHANNEL")
    private String l9SaleChannel;

    @Column(name = "L9_SALE_ID")
    private String l9SaleId;

    @Column(name = "L9_SMS_IND")
    private String l9SmsInd;

    @Column(name = "L9_SMS_LANGUAGE")
    private String l9SmsLanguage;

    @Column(name = "L9_SPLIT_PERIOD")
    private String l9SplitPeriod;

    // @Temporal(TemporalType.DATE)
    @Column(name = "L9_TMV_ACT_DATE")
    private Date l9TmvActDate;

    @Column(name = "L9_TMV_BAN")
    private BigDecimal l9TmvBan;

    @Column(name = "L9_TMV_SERVICE_LEVEL")
    private String l9TmvServiceLevel;

    @Column(name = "L9_TRUE_LIFE_ID")
    private String l9TrueLifeId;

    @Column(name = "LANGUAGE")
    private String language;

    @Column(name = "LINK_NEXT_SUB_NO")
    private BigDecimal linkNextSubNo;

    @Column(name = "LINK_PREV_SUB_NO")
    private BigDecimal linkPrevSubNo;

    @Column(name = "OPERATOR_ID")
    private BigDecimal operatorId;

    // @Temporal(TemporalType.DATE)
    @Column(name = "ORIG_ACT_DATE")
    private Date origActDate;

    @Column(name = "PRIM_RES_PARAM_CD")
    private String primResParamCd;

    @Column(name = "PRIM_RESOURCE_TP")
    private String primResourceTp;

    @Column(name = "PRIM_RESOURCE_VAL")
    private String primResourceVal;

    @Column(name = "REQUIRED_PARTITION")
    private String requiredPartition;

    @Column(name = "ROUTING_POLICY_ID")
    private BigDecimal routingPolicyId;

    @Column(name = "SUB_PASSWORD")
    private String subPassword;

    @Column(name = "SUB_SEQ_NO")
    private BigDecimal subSeqNo;

    @Column(name = "SUB_STATUS")
    private String subStatus;

    // @Temporal(TemporalType.DATE)
    @Column(name = "SUB_STATUS_DATE")
    private Date subStatusDate;

    // @Temporal(TemporalType.DATE)
    @Column(name = "SUB_STS_ISSUE_DATE")
    private Date subStsIssueDate;

    @Column(name = "SUB_STS_LAST_ACT")
    private String subStsLastAct;

    @Column(name = "SUB_STS_RSN_CD")
    private String subStsRsnCd;

    @Id
    @Column(name = "SUBSCRIBER_NO")
    private int subscriberNo;

    @Column(name = "SUBSCRIBER_TYPE")
    private String subscriberType;

    // @Temporal(TemporalType.DATE)
    @Column(name = "SYS_CREATION_DATE")
    private Date sysCreationDate;

    // @Temporal(TemporalType.DATE)
    @Column(name = "SYS_UPDATE_DATE")
    private Date sysUpdateDate;

    @Column(name = "TRX_ID")
    private BigDecimal trxId;

    @Column(name = "CUSTOMER_ID")
    private int customerId;

    // bi-directional many-to-one association to Customer
    // @OneToMany(fetch = FetchType.EAGER, mappedBy = "customer")
    @JsonIgnore
    @ManyToOne(optional = false, targetEntity = Customer.class)
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID", updatable = false, insertable = false)
    private Customer customer;

}
