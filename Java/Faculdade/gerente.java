   class gerente extends funcionario{
    	int senha=123;
    	
    	public boolean autentica(String senha)
    	{
    		int v1;
    		v1 = Integer.parseInt(senha);
    		if(this.senha == v1)
    		{
    			return true;
    		}
    		else
    			return false;
    	}
    	
    	public double getbo()
    	{
    		return this.salario * 0.15;
    	}
    }