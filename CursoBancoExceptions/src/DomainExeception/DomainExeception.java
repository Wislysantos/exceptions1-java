package DomainExeception;

public class DomainExeception extends Exception{//teve que criar uma classe de exce��es para criara o erro e fechar o programa
		private static final long serialVersionUID = 1L;
		
		public DomainExeception(String msg) {		
			super(msg);
		}

}
