package assignment3;

//public class prefix {
	//Paperwork: Convert followinf expression to Prefix using stack algorithm. Refer code.
	 //5+9-4*(8-6/2)+1$(7-3)
// step-1: for prfix operation from infix operation,we have to travel from last to starting position.
 //step-2: if there is operand then directly push on stack 
//step-3: if there is operator then check its priority,if priority of expression operator is greater than stack peek opeartor then experssion operator overload it.
//step:4.then append prefix expression and reverse it .
//..prefix:37-1$26/8-4*95+-+;
//revers it final prefix:+-+59*4-8/62$1-73

//}
// Paperwork: Convert following examples from Infix to Prefix and Postfix.
//K + L - M*N + (O^P) * W/U/V * T + Q
//postfix-KL+MN*OP^W*U/V/T*+-
//+-//+-+KL*MN*^OPWOV/Q

//(A + B) * C - (D - E) * (F + G)
//postfix:AB +C*DE-FG+*-
//PREFIX-*-+ABC*-DE+FG
