package com.sancrisxa.eventsmicroservice.repositories;

import com.sancrisxa.eventsmicroservice.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
