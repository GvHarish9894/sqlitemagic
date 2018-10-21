package com.siimkinks.sqlitemagic.entity;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import io.reactivex.Single;

/**
 * Builder for table delete operation.
 */
public interface EntityDeleteTableBuilder extends ConnectionProvidedOperation<EntityDeleteTableBuilder> {
  /**
   * Execute this configured table delete operation against a database.
   *
   * @return Nr of deleted records
   */
  int execute();

  /**
   * Creates a {@link Single} that when subscribed to executes this configured table
   * delete operation against a database and emits nr of deleted records to downstream
   * only once.
   *
   * @return Deferred {@link Single} that when subscribed to executes the operation and emits
   * its result to downstream
   */
  @NonNull
  @CheckResult
  Single<Integer> observe();
}
