package br.com.ivia.querydsl.repository;

import static junit.framework.Assert.assertNull;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.DependencyResolvers;
import org.jboss.shrinkwrap.resolver.api.maven.MavenDependencyResolver;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.ivia.querydsl.fachada.FachadaQueryDsl;
import br.com.ivia.querydsl.model.Customer;
import br.com.ivia.querydsl.model.dto.CustomerDTO;
import br.com.ivia.querydsl.view.CustomerDtoBean;

@RunWith(Arquillian.class)
public class CustomerRepositoryTest {

	@Deployment
	public static Archive<?> createTestArchive() {
		return ShrinkWrap
				.create(WebArchive.class, "test.war")
				.addPackages(true, Customer.class.getPackage(),
						CustomerRepository.class.getPackage(),
						FachadaQueryDsl.class.getPackage(),
						CustomerDTO.class.getPackage(),
						CustomerDtoBean.class.getPackage())
				.addAsResource("META-INF/test-persistence.xml",
						"META-INF/persistence.xml")
				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
				// Deploy our test datasource
				.addAsWebInfResource("test-ds.xml", "test-ds.xml")
				.addAsLibraries(
						DependencyResolvers.use(MavenDependencyResolver.class)
								.includeDependenciesFromPom("pom.xml")
								.resolveAsFiles());
	}

	@EJB
	private CustomerRepository customerRepository;

	@Test
	public void testarJunit() {
		assertNull(customerRepository.findByFirstName("Luiz"));
	}
}
