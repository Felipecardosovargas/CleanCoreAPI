CREATE TABLE user_companies (
                                user_id UUID NOT NULL,
                                company_id UUID NOT NULL,

                                PRIMARY KEY (user_id, company_id),

                                CONSTRAINT fk_user
                                    FOREIGN KEY (user_id)
                                        REFERENCES users (id)
                                        ON DELETE CASCADE,

                                CONSTRAINT fk_company
                                    FOREIGN KEY (company_id)
                                        REFERENCES companies (id)
                                        ON DELETE CASCADE
);