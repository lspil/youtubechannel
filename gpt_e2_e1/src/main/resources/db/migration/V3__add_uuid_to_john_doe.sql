UPDATE employees
SET internal_id = (SELECT UUID())
WHERE id = 1 AND internal_id IS NULL;