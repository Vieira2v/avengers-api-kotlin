package one.digitalinnovation.avengers.domain.avenger

import one.digitalinnovation.avengers.domain.avenger.Avenger
import org.springframework.stereotype.Repository

@Repository
interface AvengerRepository {
    fun getDetail(id: Long): Avenger?
    fun getAvengers(): List<Avenger>
    fun create(avenger: Avenger): Avenger
    fun delete(id: Long)
    fun update(avenger: Avenger): Avenger
}