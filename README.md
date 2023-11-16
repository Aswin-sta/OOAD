# OOAD
## Domain: Banking
Use case : When a customer attempts to deposit money, the list of all accounts which the customers possess should be listed so that the customer can select to which account he would like to deposit the money. Customer can have the following accounts
#### SavingsMaxAccount
#### CurrentAccount
#### LoanAccount
· Customer(customerCode, customerName, List<Account>)
· Account(accountNo, accountType, balance, Product).
· Product(productCode, productName, List<Service>)
· SavingsMaxAccount is a Product(minimumBalance of Rs.1000 should be maintained in the account)
· CurrentAccount is a Product
· LoanAccount is a Product.(chequeDeposit should be chargeable ie 3%).
· Service(serviceCode, serviceName,rate)
### Default services
SavingsMaxAccount(CashDeposit, ATMWithdrawl, OnlineBanking)
CurrentAccount(CashDeposit, OnlineBanking, ATMWithdrawl, MobileBanking)
LoanAccount(CashDeposit, ChequeDeposit)

## Class Diagram
![model umlcd](https://github.com/Aswin-sta/OOAD/assets/96405492/2cffba21-3d36-410a-8510-1aba02f6b1dc)
