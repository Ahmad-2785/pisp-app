package org.mifos.openbanking.domain.usecase.createTransactionRequest

import org.mifos.openbanking.base.Response
import org.mifos.openbanking.data.repository.OpenBankingRepository
import org.mifos.openbanking.domain.usecase.base.BaseUseCase

class CreateTransactionRequestUseCase(private val repository: OpenBankingRepository = OpenBankingRepository()) :
    BaseUseCase<CreateTransactionRequestRequest, CreateTransactionRequestResponse>() {

    override suspend fun run(request: CreateTransactionRequestRequest): Response<CreateTransactionRequestResponse> {
        return repository.createTransactionRequest(request)
    }
}