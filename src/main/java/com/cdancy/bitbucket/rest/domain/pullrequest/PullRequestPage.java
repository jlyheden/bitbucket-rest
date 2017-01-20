package com.cdancy.bitbucket.rest.domain.pullrequest;

import com.cdancy.bitbucket.rest.domain.common.*;
import com.cdancy.bitbucket.rest.domain.common.Error;
import com.cdancy.bitbucket.rest.utils.Utils;
import com.google.auto.value.AutoValue;
import org.jclouds.javax.annotation.Nullable;
import org.jclouds.json.SerializedNames;

import java.util.List;

/**
 * Created by Johan Lyheden <Johan.Lyheden@UNIBET.com> on 20/01/17.
 */
@AutoValue
public abstract class PullRequestPage implements Page<PullRequest>, ErrorsHolder {

    @SerializedNames({ "start", "limit", "size", "nextPageStart", "isLastPage", "values", "errors" })
    public static PullRequestPage create(int start, int limit, int size, int nextPageStart, boolean isLastPage,
                                         @Nullable List<PullRequest> values, @Nullable List<Error> errors) {
        return new AutoValue_PullRequestPage(start, limit, size, nextPageStart, isLastPage,
            Utils.nullToEmpty(values), Utils.nullToEmpty(errors));
    }

}
