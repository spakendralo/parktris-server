package org.soframel.parktris.parktrisserver.repositories

import org.soframel.parktris.parktrisserver.vo.Loan
import org.soframel.parktris.parktrisserver.vo.ParkingArea
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "loan", path = "loan")
interface LoanRepository : MongoRepository<Loan, String> {

}