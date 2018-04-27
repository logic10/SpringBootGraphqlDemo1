package th.co.truecorp.esd.grapghql.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import th.co.truecorp.esd.grapghql.models.CsmAccount;
import th.co.truecorp.esd.grapghql.repositories.CsmAccountRepository;

@Component
public class FindCsmAccountResolver implements DataFetcher<List<CsmAccount>> {

	@Autowired
	private CsmAccountRepository csmAccountRepo;
/*
	@Override
	public List<CsmAccount> get(DataFetchingEnvironment environment) {
		//String csmbanNo = environment.getArgument("banNo");
		
		//return csmAccountRepo.findBanId(csmbanNo);
	}
*/

	@Override
	public List<CsmAccount> get(DataFetchingEnvironment arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
