package shreya.cg.gla.spring.dao;

import java.util.List;

import shreya.cg.gla.spring.entity.Product;
import shreya.cg.gla.spring.entity.ProductOld;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> reterivev1();
//	public List<ProductOld> reterieve();

}
