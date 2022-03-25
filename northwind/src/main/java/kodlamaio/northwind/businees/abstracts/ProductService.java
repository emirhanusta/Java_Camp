package kodlamaio.northwind.businees.abstracts;

import java.util.List;

import kodlamaio.northwind.entities.concrete.Product;

public interface ProductService {
	List<Product> getAll();
}
