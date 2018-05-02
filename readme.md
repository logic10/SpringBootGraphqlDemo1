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
