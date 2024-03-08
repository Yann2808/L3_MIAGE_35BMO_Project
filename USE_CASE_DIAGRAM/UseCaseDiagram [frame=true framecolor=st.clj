UseCaseDiagram [frame=true framecolor=steelblue label="Usecase Diagram"] {
  attribute usecase [fillcolor=paleturquoise]
  actor a as "Administrator"
  actor c as "Customer"
  system s as "ATM System" [fillcolor=whitesmoke] {
    usecase u1 as "Withdraw" 
    usecase u2 as "Transfer" 
    usecase u5 as "Read log"
    usecase u3 as "Deposit" 
    usecase u4 as "Register ATM" 
  }
  actor b as "Bank" [icon=university]
  c "1" -- "0..1" u1
  c "1" -- "0..1" u2
  c "1" -- "0..1" u3
  a "1" -- "0..1" u4
  a "1" -- "0..1" u5
  u3 "0..*" -- "1" b
  u4 "0..*" -- "1" b
}