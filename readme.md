Rest.
http://localhost:8888/swagger-ui.html

Graph.
http://localhost:8888/graphiql

#Readme
Example.
#################################################
#1.1 Query searchCustomer
query searchCustomer($input: CustomerFilter!){

  searchCustomerByCusttypeAndCert: searchCustomer(filter:$input){
      customerId
      operatorId
      subscribers{
         subSeqNo
         operatorId
      }
  }
}
#Query variable
{
  "input" : {
                "customerType": "I"
               ,"certification":"3700800531726"
           }
}
#######################__
#1.2 mutation createCustomer
mutation createCustomer($input: CustomerInput!){

  createCustomer(customer:$input){
      customerId
      operatorId
      subscribers{
         subSeqNo
         operatorId
      }
  } 
}
#Query variable
{
  "input" : {
                "customerId": 84863
               ,"operatorId": 106
               ,"applicationId": "CD"
           }
}
############################
#1.3 mutation updateCustomer
mutation updateCustomer($input: CustomerInput!){

  createCustomer(customer:$input){
      customerId
      operatorId
      subscribers{
         subSeqNo
         operatorId
      }
  }
  
}
#Query variable
{
  "input" : {
                "customerId": 84863
               ,"operatorId": 106
               ,"billCycProdFreq": 2
               ,"applicationId": "CD"
           }
}
############################


Version Ten.1
query searchCustomer($input: CustomerFilter!, 
  $inputbycustomerid: CustomerFilter!,
  $inputbycertificatedid: CustomerFilter!,
  $inputbyban: CustomerFilter!) {
    
  searchCustomerByCusttypeAndCert: searchCustomer(filter: $input) {
    customerId
    operatorId
    subscribers {
      subSeqNo
      operatorId
    }
  }
  searchCustomerByCustomerAndSubStatus: searchCustomer(filter: $inputbycustomerid) {
    customerId
    operatorId
    csmAccounts{
      ban
      collStatus
    }
    subscribers {
      subSeqNo
      operatorId
    }
  }
  searchCustomerByCertificate: searchCustomer(filter: $inputbycertificatedid) {
    customerId
    operatorId
    
    subscribers {
      subSeqNo
      operatorId
    }
  }
    searchCustomerByBan: searchCustomer(filter: $inputbyban) {
    customerId
    operatorId
    subscribers {
      subSeqNo
      operatorId
    }
  }
}

Query Valiable

{
  "input" : {
                "customerType": "I"
               ,"certification":"3700800531726"
    
  },
  "inputbycustomerid": {
    "customerId": 84862
  },
  "inputbycertificatedid": {
    "certification": "3700800531726"
  },
  "inputbyban": {
    "ban": "10102436"
  }
}



